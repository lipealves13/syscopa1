package controllers;

public class Utils {
	public final void limpatela() {
		try {
			final String os = System.getProperty("os.name");

			if (os.contains("Windows")) {
				Runtime.getRuntime().exec("cls");
			} else {
				Runtime.getRuntime().exec("clear");
			}
		} catch (final Exception e) {
			// Handle any exceptions.
		}
	}

	public void opcaoInvalida() {
		System.out.println("####################################");
		System.out.println("### Opção inválida tente de novo ###");
		System.out.println("####################################");
	}
}
