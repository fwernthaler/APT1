public class CirclesCountry {
	public int leastBorders(int[] x, int[] y, int[] r, 
			int x1, int y1, int x2, int y2) {
		int count = 0;

		for (int k = 0; k < x.length; k += 1) {
			if (r[k] <= Math.sqrt(Math.pow((x1 - x[k]), 2) + Math.pow((y1 - y[k]), 2))) {
				if (r[k] >= Math.sqrt(Math.pow((x2 - x[k]), 2) + Math.pow((y2 - y[k]), 2))) {
					count += 1;
				}
			}
			if (r[k] <= Math.sqrt(Math.pow((x2 - x[k]), 2) + Math.pow((y2 - y[k]), 2))) {
				if (r[k] >= Math.sqrt(Math.pow((x1 - x[k]), 2) + Math.pow((y1 - y[k]), 2))) {
					count += 1;
				}
			}
		}

		return count;
	}
}