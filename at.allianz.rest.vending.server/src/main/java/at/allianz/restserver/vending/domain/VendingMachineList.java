package at.allianz.restserver.vending.domain;

import java.util.ArrayList;

public class VendingMachineList {

	private ArrayList<VendingMachine> machines;

	public VendingMachineList(ArrayList<VendingMachine> machines) {
		this.machines = machines;
	}

	public VendingMachineList() {
	}

	public ArrayList<VendingMachine> getMachines() {
		return machines;
	}

	public void setMachines(ArrayList<VendingMachine> machines) {
		this.machines = machines;
	}

}
