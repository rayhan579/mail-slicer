/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mail.slicer;

import java.util.Scanner;
import java.io.*;
import java.util.*;

/**
 *
 * @author Keerthana
 */
public class MailSlicer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String s=sc.next();
       if(s.indexOf('@')!=-1)
       {
           int n=s.indexOf("@");
           int x=n+1;
           System.out.println("username is:" );
           System.out.println(s.substring(0,n)); 
           System.out.println("domain name is:");
           System.out.println(s.substring(x));
       }
       else{
          System.out.println("the email address is not correct");
          }
       
    }
    
}
