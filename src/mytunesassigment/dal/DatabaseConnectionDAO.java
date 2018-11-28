/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunesassigment.dal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nedas
 */

public class DatabaseConnectionDAO {
    
        public List<String> getDatabaseInfo() throws IOException {
        List<String> info = new ArrayList();
        String source = "data/loginDetails.txt";
        File file = new File(source);

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) 
        {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.isEmpty()) {
                    try {
                        info.add(line);
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                }
            }
        }
        return info;
    }
}
