
public class chess {
	
	public int size=8;
	public point[][] board;
	
	public int paths=0;
	public int numQueen;
	public int queens;

	public void init(){
	board=new point[size][size];
	solve(0, 0);
	
	}
	
	public void solve(int x1, int y1){
		if (queens==8){
			System.out.println("done");
			paths++;
		}
		else{
			for (int t=0;t<size;t++){
				board[x1][t].blocked=true;
				board[t][y1].blocked=true;
			} 
			for (int t=0;t<size;t++){
			board[x1+t][y1+t].blocked=true;
			}
			for (int t=0;t<size;t++){
			board[x1-t][y1-t].blocked=true;
			}
			
			for (int x=0;x<size;x++){
				for (int y=0;y<size;y++){
					if (board[x][y].blocked==false){
						board[x][y].queen=true;
						queens++;
						board[x][y].blocked=true;
					}
				}
			}
		}
	}
	
	/*public void find(){
	for (int x=0;x<size;x++){
		queen[x].x=x;
		for (int y=0;y<size;y++){
		board[x][y].blocked=true;
		}
		}}*/  
		
	
	
}