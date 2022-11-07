package abstraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fileType;
        String opType;
        System.out.println("Input your file type (DOC, TXT, XML): ");
        fileType = scan.nextLine();
        System.out.println("Input the operation (open, create, change, save): ");
        opType = scan.nextLine();
        if (fileType == "DOC") {
            switch (opType){
                case "open" :{
                    AbstractHandler dc = new DOCHandler();
                    dc.open();
                    break;
                }
                case "create" :{
                    AbstractHandler dc = new DOCHandler();
                    dc.create();
                    break;
                }
                case "change" :{
                    DOCHandler dc = new DOCHandler();
                    dc.change();
                    break;
                }case "save" :{
                    DOCHandler dc = new DOCHandler();
                    dc.save();
                    break;

                }
                default:
                    System.out.println("type or operation is not existing");

            }//switch
        }//if
        if (fileType == "TXT") {
            switch (opType){
                case "open" :{
                    TXTHandler dc = new TXTHandler();
                    dc.open();
                    break;
                }
                case "create" :{
                    TXTHandler dc = new TXTHandler();
                    dc.create();
                    break;
                }
                case "change" :{
                    TXTHandler dc = new TXTHandler();
                    dc.change();
                    break;
                }case "save" :{
                    TXTHandler dc = new TXTHandler();
                    dc.save();
                    break;

                }
                default:
                    System.out.println("type or operation is not existing");

            }//switch
        }//if
        if (fileType == "XML") {
            switch (opType){
                case "open" :{
                    XMLHandler dc = new XMLHandler();
                    dc.open();
                    break;
                }
                case "create" :{
                    XMLHandler dc = new XMLHandler();
                    dc.create();
                    break;
                }
                case "change" :{
                    XMLHandler dc = new XMLHandler();
                    dc.change();
                    break;
                }case "save" :{
                    XMLHandler dc = new XMLHandler();
                    dc.save();
                    break;

                }
                default:
                    System.out.println("type or operation is not existing");

            }//switch
        }//if



    }//main
}//Main
