package CoreJava_Day_1;



public class Matrix {
	int rows;
	int columns;
	int matrix[][];
	public Matrix() {
		super();
		// TODO Auto-generated constructor stub
		rows=0;
		columns=0;
		matrix=new int[rows][columns];
	}
	public Matrix(int rows, int columns) {
		super();
		if(rows<0 && rows>10) {
			throw new IllegalArgumentException("rows invalid");
		}
		this.rows = rows;
		if(columns<0 && columns>10) {
			throw new IllegalArgumentException("columns invalid");
		}
		this.columns = columns;
		matrix =new int[rows][columns];
		
	}
	void setElement(int r, int c, int value) {
		if(r<0 && r>10) {
			throw new IllegalArgumentException("rows invalid");
		}
		if(c<0 && c>10) {
			throw new IllegalArgumentException("columns invalid");
		}
		if(value<0) {
			value=0;
		}
		matrix[r][c]=value;
	}
	public void matrixTranspose() {
		
	}
	
	public void show() {
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
