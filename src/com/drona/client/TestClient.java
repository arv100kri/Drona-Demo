package com.drona.client;

import java.rmi.RemoteException;

import com.drona.service.CalculatorServiceStub;
import com.drona.service.CalculatorServiceStub.CalculateOperation;
import com.drona.service.CalculatorServiceStub.CalculateOperationResponse;

public class TestClient {

	/**
	 * @param args
	 * @throws RemoteException 
	 */
	public static void main(String[] args) throws RemoteException
	{
		CalculatorServiceStub stub = new CalculatorServiceStub();
		CalculateOperation obj = new CalculateOperation();
		obj.setA(100);
		obj.setB(200);
		obj.setChoice(1);
		CalculateOperationResponse resp = stub.calculateOperation(obj);
		System.out.println(resp.get_return());
	}

}
