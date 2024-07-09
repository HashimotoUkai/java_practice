package step10;

public class Test {
	
	public static void main(String[] args) {
		//ここでPointで作成したものに引数を渡す
		Point p1 = new Point(1.0, 2.0);
		Point p2 = new Point(4.0, 6.0);
		
		
		//　2点間の距離を計算
		double distance = calculateDistance(p1, p2);
		System.out.println("2点間の距離は " + distance);
		
	}
	
    // ここで距離を計算する関数
    public static double calculateDistance(Point p1, Point p2) {
		double x1 = p1.getX();
		double x2 = p1.getY();
		double y1 = p2.getX();
		double y2 = p2.getY();
		
        double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        return distance;
    }

}

