package ThreadProject;

public class Cook implements Runnable{

	private Table table;

	public Cook(Table table) {
		this.table = table;
	}
	
	@Override
	public void run() {
		while(true) { // 무한반복
			int idx = (int)(Math.random() * table.dishNum());
			table.add(table.dishNames[idx]); // 테이블에 있는 배열을 가져온다
			
			try {
				Thread.sleep(10); // 0.001
			} catch (InterruptedException e) {
				
			}
		}
	}
}
