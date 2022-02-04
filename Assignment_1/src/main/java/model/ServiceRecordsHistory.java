/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.*;

/**
 *
 * @author sumeetsunildeshpande
 */
public class ServiceRecordsHistory {
    private ArrayList<ServiceRecords> history;
    
    public ServiceRecordsHistory(){
        this.history=new ArrayList<ServiceRecords>();
    }

    public ArrayList<ServiceRecords> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<ServiceRecords> history) {
        this.history = history;
    }
    
    public ServiceRecords addNewRecords(){
        ServiceRecords servicerecord= new ServiceRecords();
        history.add(servicerecord);
        return servicerecord;
        
    }
            
}
