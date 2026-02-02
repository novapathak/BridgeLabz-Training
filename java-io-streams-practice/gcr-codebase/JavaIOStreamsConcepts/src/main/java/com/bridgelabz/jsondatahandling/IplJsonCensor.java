package com.bridgelabz.jsondatahandling;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;

public class IplJsonCensor {

	static String maskTeam(String teamName) {
		String[] parts = teamName.split(" ");
		return parts[0] + " ***";
	}

	public static void main(String[] args) {

		try {
			ObjectMapper mapper = new ObjectMapper();
			JsonNode matches = mapper.readTree(new File("ipl.json"));
			ObjectNode obj = (ObjectNode) matches;

			String team1 = matches.get("team1").asText();
			String team2 = matches.get("team2").asText();

			obj.put("team1", maskTeam(team1));
			obj.put("team2", maskTeam(team2));


			obj.put("player_of_match", "REDACTED");
			mapper.writerWithDefaultPrettyPrinter()
			.writeValue(new File("ipl_censored.json"), matches);

			System.out.println("JSON Censorship completed successfully.");

		}

		catch(Exception e) {
			System.out.println("Exception");
		}
	}
}


