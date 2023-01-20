// Caleb Gibson
// COP3330
// Assignment 7: Interfaces
// due 11/21/2022

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SportRunner {

	public static void main(String[] args) throws IOException {
		// create the list of sports
		ArrayList<Sports> sportList = new ArrayList<Sports>();
		
		// read in the filename and create a scanner to read in the file with that filename
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What is the name of the input file you would like to use?");
		String filename = stdin.readLine();
		BufferedReader fileInput = new BufferedReader(new FileReader(filename));
		
		// read in the input file
		// read in the number of teams
		String teams = fileInput.readLine();
		int numTeams = Integer.parseInt(teams);
		
		// read in each team's associated sport
		String input;
		for(int i = 0; i < numTeams; i++) {
			input = fileInput.readLine();
			if (input.equals("Football")) {
				sportList.add(new Football(i));
			} else {
				sportList.add(new Basketball(i));
			}
		}
		
		// read in the number of scores
		String numScoresString = fileInput.readLine();
		int numScores = Integer.parseInt(numScoresString);
		
		// read in the details of each score (the ID of the team that scored it and that score's size category) 
		StringTokenizer scores;
		String score, scoreType;
		for(int i = 0; i < numScores; i++) {
			score = fileInput.readLine();
			scores = new StringTokenizer(score, " ");
			int id = Integer.parseInt(scores.nextToken());
			scoreType = scores.nextToken();
			if (scoreType.equals("s")) {
				sportList.get(id).score_small();
			} else if (scoreType.equals("m")) {
				sportList.get(id).score_med();
			} else if (scoreType.equals("l")) {
				sportList.get(id).score_large();
			}
		}
		
		// Sort the data
		Collections.sort(sportList);
		
		// print each team's ID and their total score
		for(int i = 0; i < numTeams; i++) {
			System.out.println(sportList.get(i).get_id() + " - " + sportList.get(i).get_score());
		}
		
		// close all of the buffered readers
		stdin.close();
		fileInput.close();
	}

}
