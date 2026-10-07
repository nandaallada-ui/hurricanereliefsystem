package com.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import com.data.users; 

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class DataLoader extends DataConstants {

   public static ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<>();

        try (FileReader reader = new FileReader(USERS_FILE_NAME)) {
            JSONParser parser = new JSONParser();
            JSONArray usersJSON = (JSONArray) parser.parse(reader);

            for (int i = 0; i < sheltersJSON.size(); i++) {
                JSONObject shelterJSON = (JSONObject) sheltersJSON.get(i);

                String location = (String) shelterJSON.get(SHELTER_LOCATION);
                long capacity = (Long) shelterJSON.get(SHELTER_CAPACITY);
                long occupancy = (Long) shelterJSON.get(SHELTER_OCCUPANCY);
                String status = (String) shelterJSON.get(SHELTER_STATUS);
                boolean petFriendly = (Boolean) shelterJSON.get(SHELTER_PET_FRIENDLY);

                shelters.add(new Shelter(location, (int) capacity, (int) occupancy, status, petFriendly));
            }

            return users;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return users;

        } 
}
