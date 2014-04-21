package hu.OpenCraft.Launcher.exceptions;

import hu.OpenCraft.Launcher.stores.ClientManager;

public class InitException extends Exception {
	
	private static final long serialVersionUID = ClientManager.SERIAL;

	public InitException() {
		super(""); //TODO
	}
}
