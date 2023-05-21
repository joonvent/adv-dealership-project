package com.yearup.dealership;

import java.io.*;
import java.util.ArrayList;

public class ContractDataManager {

    public  void saveContract(Contract contract) throws FileNotFoundException {
        ArrayList<Contract> contracts = new ArrayList<>();


        try (BufferedWriter buffer1 = new BufferedWriter(new FileWriter("contracts.csv"))) {

            if (contract instanceof SalesContract) {
              //  String formattedData;
                buffer1.write("SALES" +"|" + contract.getDateOfContract() + "|" + contract.getCustomerName() + "|" + contract.getCustomerEmail() + "|" + contract.getVehicleSold().getVin() + "|" + contract.getVehicleSold().getYear() + "|" + contract.getVehicleSold().getMake() + "|" + contract.getVehicleSold().getModel() + "|" + contract.getVehicleSold().getVehicleType() + "|" + contract.getVehicleSold().getColor() + "|" + contract.getVehicleSold().getOdometer() + "|" + contract.getVehicleSold().getPrice() + "|" + ((SalesContract) contract).getSalesTaxAmount() + "|" + ((SalesContract) contract).getRecordingFee() + "|" + ((SalesContract) contract).getProcessingFee() + "|" + contract.getTotalPrice() + "|" + ((SalesContract) contract).isFinanceOption() + "|" + contract.getMonthlyPayment());


            } else if (contract instanceof LeaseContract) {
                buffer1.write("LEASE" +"|" + contract.getDateOfContract() + "|" + contract.getCustomerName() + "|" + contract.getCustomerEmail() + "|" + contract.getVehicleSold().getVin() + "|" + contract.getVehicleSold().getYear() + "|" + contract.getVehicleSold().getMake() + "|" + contract.getVehicleSold().getModel() + "|" + contract.getVehicleSold().getVehicleType() + "|" + contract.getVehicleSold().getColor() + "|" + contract.getVehicleSold().getOdometer() + "|" + contract.getVehicleSold().getPrice() + "|" + ((LeaseContract) contract).getExpectedEndingValue() + "|" + ((LeaseContract) contract).getLeaseFee() + "|" + contract.getTotalPrice() + "|" + contract.getMonthlyPayment());


            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
