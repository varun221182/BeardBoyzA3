/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp;

import java.awt.EventQueue;

import bcccp.carpark.CarSensor;
import bcccp.carpark.Carpark;
import bcccp.carpark.Gate;
import bcccp.carpark.entry.EntryController;
import bcccp.carpark.entry.EntryUI;
import bcccp.carpark.exit.ExitController;
import bcccp.carpark.exit.ExitUI;
import bcccp.carpark.paystation.PaystationController;
import bcccp.carpark.paystation.PaystationUI;
import bcccp.tickets.adhoc.AdhocTicketFactory;
import bcccp.tickets.adhoc.IAdhocTicket;
import bcccp.tickets.adhoc.AdhocTicketDAO;
import bcccp.tickets.adhoc.IAdhocTicketDAO;
import bcccp.tickets.season.ISeasonTicket;
import bcccp.tickets.season.ISeasonTicketDAO;
import bcccp.tickets.season.SeasonTicket;
import bcccp.tickets.season.SeasonTicketDAO;
import bcccp.tickets.season.UsageRecordFactory;
import java.util.Date;

public class UnitTestingEntryUI1 {
    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					long entryTime = System.currentTimeMillis();                   
					//Invoking EntryUI Constructor
                    EntryUI eui = new EntryUI(320, 100);	
					                   
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
