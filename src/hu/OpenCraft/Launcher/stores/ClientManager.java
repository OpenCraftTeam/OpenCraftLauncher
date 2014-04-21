package hu.OpenCraft.Launcher.stores;

import java.util.ArrayList;
import java.util.List;

import hu.OpenCraft.Launcher.exceptions.InitException;

public class ClientManager {

	/** Static variables **/
	private static ClientManager Instance = null;
	public static final long SERIAL = 0x224A439AB534C914L; 
	public static final String AUTH = "http://...";
	public static final String SERVERS = "http://...";
	public static final String REGISTER = "http://...";
	public static String lang_code;
	
	/** Data stores **/
	private UserStore userstore;
	private List<ServerData> thelist = new ArrayList<ServerData>(); 
	
	/**
	 * 
	 * @throws InitException
	 * @author Gerviba
	 */
	public ClientManager() throws InitException {
		if(ClientManager.getInstance() == null) {
			throw new InitException();
		}
		ClientManager.Instance = this;
	}

	public static ClientManager getInstance() {
		return Instance;
	}

	public List<ServerData> getThelist() {
		return thelist;
	}

	public void addServer(ServerData sd) {
		this.thelist.add(sd);
	}
	
	public void clearServers() {
		this.thelist.clear();
	}

	public UserStore getUserstore() {
		return userstore;
	}

	public void setUserstore(UserStore userstore) {
		this.userstore = userstore;
	}

}
