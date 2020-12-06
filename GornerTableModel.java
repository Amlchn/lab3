package bsu.rfe.java.group9.molchanov.var17;

import javax.swing.table.AbstractTableModel;

public class GornerTableModel extends AbstractTableModel {
	private Double[] coefficients;
	private Double from;
	private Double to;
	private Double step;
	
	public GornerTableModel(Double from, Double to, Double step, Double[] coefficients) {
		this.from = from;
		this.to = to;
		this.step = step; 
		this.coefficients = coefficients;
		}
	  public Double getFrom() { 
    return from;
	  }
	
	public Double getTo() {
	return to;
	}
	
	public Double getStep() {
	return step;
	}


	public Double[] getCoefficients() {
		return coefficients;
	}
	public void setCoefficients(Double[] coefficients) {
		this.coefficients = coefficients;
	}

	public int getRowCount() {
		return new Double(Math.ceil((to-from)/step)).intValue()+1;
		}

	public int getColumnCount() {
		
		return 3;
	}

	public Object getValueAt(int row, int column ) {
	  double x=from+step*row;
	
	  if(column==0) {
		  return x;
	  } 
	  else {
		  Double result=0.0;
for(int i =0; i<coefficients.length;i++) {
	result+=Math.pow(x, coefficients.length-1-i) * coefficients[i];
}
			

				  return result;
	  }
	}

	public String getColumnName(int column) {
		switch(column) {
		case 0:
			return "значение X";
		case 1:
				return "значение многочлена";
				default:
					return "pyfxty";
		}
	}

	public Class<?> getColumnClass(int columnIndex) {
		return Double.class;
	}

}
