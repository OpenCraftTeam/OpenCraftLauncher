package hu.OpenCraft.Launcher.stores;

public class UserStore {

	/** User options **/
	private String UUID;
	private String Username;
	private String PassToken;
	private boolean savePass;
	
	/**
	 * Stores the data for the user.
	 * @param UUID
	 * @param Username
	 * @param PassToken
	 * @param savePass
	 * @author Gerviba
	 */
	public UserStore(String UUID, String Username, String PassToken, boolean savePass) {
		this.setUUID(UUID);
		this.setUsername(Username);
		this.setPassToken(PassToken);
		this.setSavePass(savePass);
	}

	public String getUUID() {
		return UUID;
	}

	public void setUUID(String uUID) {
		UUID = uUID;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassToken() {
		return PassToken;
	}

	public void setPassToken(String passToken) {
		PassToken = passToken;
	}

	public boolean isSavePass() {
		return savePass;
	}

	public void setSavePass(boolean savePass) {
		this.savePass = savePass;
	}
	
}
