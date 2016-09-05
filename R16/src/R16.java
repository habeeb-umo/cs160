// P_ Assignment
// Author: Habeeb Mohammed
// Date:   x/xx/xxxx
// Class:  CS160
// Email:  habeeb@cs.colostate.edu
public class R16 implements RecitationInterface {

	PictureLibrary piclib = null;
	public int imageWidth = 0,
			   imageHeight = 0;
	int[][] data;
	
	public R16(){
		//Instantiate PictureLibrary object
		piclib = new PictureLibrary();
	}
	
	@Override
	public void readImage(String inFile) {
		// TODO Auto-generated method stub
		try {
			piclib.readPGM(inFile);
			imageHeight = piclib.getHeight();
			imageWidth = piclib.getWidth();
			data = piclib.getData();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void writeImage(String outFile) {
		// TODO Auto-generated method stub
		piclib.setData(data);
		try {
			piclib.writePGM(outFile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	@Override
	public int[][] imageData() {
		
		return data;
		
	}

	@Override
	public void negateImage(){
		for(int i=0;i<imageHeight;i++){
			for(int j=0;j<imageWidth;j++){
				data[i][j] = PictureLibrary.MAXVAL - data[i][j];
			}
		}
	}

	@Override
	public void increaseContrast() {
		for(int i=0;i<imageHeight;i++){
			for(int j=0;j<imageWidth;j++){
				if((data[i][j] >= 0) && (data[i][j] <= 127)){
					data[i][j] = data[i][j] - 16;
				}
				else if((data[i][j] <= PictureLibrary.MAXVAL) && (data[i][j] >= 128)){
					data[i][j] = data[i][j] + 16;
				}
				if(data[i][j] <= 0)
					data[i][j] = 0;
				if(data[i][j] >= PictureLibrary.MAXVAL){
					data[i][j] = PictureLibrary.MAXVAL;
				}
			}
		}
		
	}

	@Override
	public void decreaseContrast() {
		for(int i=0;i<imageHeight;i++){
			for(int j=0;j<imageWidth;j++){
				if((data[i][j] >= 0) && (data[i][j] <= 127)){
					data[i][j] = data[i][j] + 16;
				}
				else if((data[i][j] <= PictureLibrary.MAXVAL) && (data[i][j] >= 128)){
					data[i][j] = data[i][j] - 16;
				}
				if(data[i][j] <= 0)
					data[i][j] = 0;
				if(data[i][j] >= PictureLibrary.MAXVAL){
					data[i][j] = PictureLibrary.MAXVAL;
				}
			}
		}
				
			
		
	}

}
