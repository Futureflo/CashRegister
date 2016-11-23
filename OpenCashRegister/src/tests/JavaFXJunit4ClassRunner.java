package tests;

import java.util.concurrent.CountDownLatch;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javafx.application.Platform;

/**
 * This basic class runner ensures that JavaFX is running and then wraps all the
 * runChild() calls in a Plaform.runLater(). runChild() is called for each test
 * that is run. By wrapping each call in the Platform.runLater() this ensures
 * that the request is executed on the JavaFX thread.
 * 
 * @param clazz
 * @throws InitializationError
 */

public class JavaFXJunit4ClassRunner extends SpringJUnit4ClassRunner {

	/**
	 * Constructs a new JavaFXJUnit4ClassRunner with the given parameters.
	 * 
	 * @param clazz
	 *            The class that is to be run with this Runner
	 * @throws InitializationError
	 *             Thrown by the BlockJUnit4ClassRunner in the super()
	 */
	public JavaFXJunit4ClassRunner(Class<?> clazz) throws InitializationError {
		super(clazz);

		JavaFxJUnit4Application.startJavaFx();
	}

	protected void runChild(final FrameworkMethod method, final RunNotifier notifier) {

		// Create a latch which is only removed after the super runChild()
		// method has been implemented.
		final CountDownLatch latch = new CountDownLatch(1);
		Platform.runLater(new Runnable() {

			@Override
			public void run() {
				// Call super to actually do the work
				JavaFXJunit4ClassRunner.super.runChild(method, notifier);

				// Decrement the latch which will now proceed.
				latch.countDown();
			}

		});
		try {
			latch.await();
		} catch (InterruptedException e) {
			// Waiting for the latch was interrupted
			e.printStackTrace();
		}
	}
}
