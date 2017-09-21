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


public class UnitTestCarPark5 {
    
    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				
					IAdhocTicketDAO adhocTicketDAO = new AdhocTicketDAO(new AdhocTicketFactory());
					ISeasonTicketDAO seasonTicketDAO = new SeasonTicketDAO(new UsageRecordFactory());
					
					Carpark carpark = new Carpark("Bathurst Chase", 5, adhocTicketDAO, seasonTicketDAO);
					
					ISeasonTicket t1 = new SeasonTicket("S1111","Bathurst Chase", 0L, 0L);
					ISeasonTicket t2 = new SeasonTicket("S2222","Bathurst Chase", 0L, 0L);
					
					carpark.registerSeasonTicket(t1);
					carpark.registerSeasonTicket(t2);
					
					//issue a ticket so that paystation can be tested
					
					carpark.recordAdhocTicketEntry();
					                    
				
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    
}
