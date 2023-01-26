package com.anudip.lms.authentication;

import java.util.HashMap;

/**
 * A utility class for storing and retrieving admin details.
 * 
 * This class has a `static` `HashMap` called `admins` that stores the username
 * and password hash of each admin. The `static` block initializes the `admins`
 * map with a set of predefined username and password hash pairs.
 * 
 * The class has three `static` methods: `getPasswordHash`, `hasAdmin`, and
 * `getAdmins`. The `getPasswordHash` method returns the password hash of the
 * admin with the specified username. The `hasAdmin` method returns whether the
 * `admins` map contains an entry with the specified username. The `getAdmins`
 * method returns the `admins` map.
 */
public final class AdminDetails {
	// A map that stores the username and password hash of each admin
	private static final HashMap<String, String> admins = new HashMap<>();

	static {
		// Populate the map with username and password hash pairs
		admins.put("arnab", "LMS@502");
		admins.put("rohit", "LMS@602");
		admins.put("bidisha", "LMS@705");
		admins.put("pritam", "LMS@802");
		admins.put("tiyasha", "LMS@902");
		admins.put("puja", "LMS@905");
	}

	/**
	 * Returns the password hash of the admin with the specified username.
	 * 
	 * @param username the username of the admin
	 * @return the password hash of the admin with the specified username
	 */
	static String getPasswordHash(String username) {
		return admins.get(username);
	}

	/**
	 * Checks if the given username corresponds to an admin.
	 *
	 * @param username the username to check
	 * @return true if the username is an admin, false otherwise
	 */
	public static boolean hasAdmin(String username) {
		return admins.containsKey(username);
	}

	/**
	 * Returns the map of admins.
	 *
	 * @return the map of admins
	 */
	public static HashMap<String, String> getAdmins() {
		return admins;
	}

}
