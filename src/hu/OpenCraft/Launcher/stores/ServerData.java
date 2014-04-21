package hu.OpenCraft.Launcher.stores;

public class ServerData {

	private final String name, motd, ip, rating, country, status;
	@SuppressWarnings("unused")
	private boolean isPaid;

	/**
	 * Stores the data for a server.
	 * @param name
	 * @param motd
	 * @param ip
	 * @param rating
	 * @param country
	 * @param status
	 * @author Gerviba
	 */
	public ServerData(String name, String motd, String ip, String rating, String country, String status) {
		this.name = name;
		this.motd = motd;
		this.ip = ip;
		this.rating = rating;
		this.country = country;
		this.status = status;
	}
	
	public String getName() {
		return name;
	}
	
	public String getMotd() {
		return motd;
	}

	public String getIp() {
		return ip;
	}

	public String getRating() {
		return rating;
	}

	public String getCountry() {
		return country;
	}

	public String getStatus() {
		return status;
	}
	
	/**
	 * It sets the server paid status.
	 * @param isPaid
	 */
	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}

}
