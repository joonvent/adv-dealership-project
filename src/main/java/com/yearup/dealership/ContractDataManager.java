package com.yearup.dealership;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ContractDataManager {

    public  void saveContract(Contract contract) throws FileNotFoundException {
        ArrayList<Contract> contracts = new ArrayList<>();


        try (BufferedReader buffer1 = new BufferedReader(new FileReader("contracts.csv"))) {
        String line;
            if (contract instanceof SalesContract) {


            } else if (contract instanceof LeaseContract) {


            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
