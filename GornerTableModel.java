package bsu.rfe.java.group9.molchanov.var17;

import javax.swing.table.AbstractTableModel;

@SuppressWarnings("serial")
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

	@SuppressWarnings("deprecation")
	public int getRowCount() {
		return new Double(Math.ceil((to-from)/step)).intValue()+1;
		}

	public int getColumnCount() {
		
		return 2;
	}

	public Object getValueAt(int row, int column) {
	  double x=from +step*row;
	  if(column==0) {
		  return x;
	  } 
	  else {
		  Double result=0.0;
		  return result;
	  }
	}

	public String getColumnName(int column) {
		switch(column) {
		case 0:
			return "значение X";
			default:
				return "значение многочлена";
		}
	}

	public Class<?> getColumnClass(int columnIndex) {
		return Double.class;
	}

}
