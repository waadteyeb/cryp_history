package application;

import java.io.IOException;
import java.math.BigInteger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Spinner;

public class controller {
	@FXML
	Spinner<Integer> a;
	Spinner<Integer> b;
	
	Point Point1 = new Point();
	public BigInteger pointX=Point1.getPointX(); 
	public BigInteger pointY=Point1.getPointY(); 
	Point Point2 = new Point();
	public BigInteger pointX2=Point2.getPointX();
	public BigInteger pointY2=Point2.getPointY(); 
	@FXML
	public void showHistory(ActionEvent event) throws IOException{
	System.out.println("a= " );
	System.out.println(this.a.getValue());
	System.out.println("b= " );
	System.out.println(this.b.getValue());
	System.out.println(" Pour le point P     "+ "x= " );
	System.out.println(this.pointX.byteValue());
	System.out.println("                          y= " );
	System.out.println(this.pointY.byteValue());
	System.out.println(" Pour le point Q     "+ "x= " );
	System.out.println(this.pointX2.byteValue());
	System.out.println("                          y= " );
	System.out.println("Donc le point R        "+"x= ");
	System.out.println(this.pointX.byteValue()+this.pointX2.byteValue());
	System.out.println("                          y= " );
	System.out.println(this.pointY.byteValue()+this.pointY2.byteValue());
	
	

}}
	
	
