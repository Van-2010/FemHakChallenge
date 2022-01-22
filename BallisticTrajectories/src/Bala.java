import java.io.Serializable;

public class Bala implements Serializable{
	
		private double vO;
		private double g=9.8;
		private double alpha;
		double h_max;
		double x_max;
		
		public Bala() {
		
		}
		public Bala(double vO, double alpha) {
			this.vO = vO;
			this.alpha = alpha;
			this.h_max=calculAlçadaMaxima(vO);
			this.x_max=calculaDistanciaMaxima(vO, alpha);
		}
		public double getvO() {
			return vO;
		}
		public double getAlpha() {
			return alpha;
		}
		public void setvO(double vO) {
			this.vO = vO;
		}
		public void setAlpha(double alpha) {
			this.alpha = alpha;
		}
		public double calculAlçadaMaxima(double vO) {
			double g=9.8;
			double h_max=(vO*vO)/(2*g);
			return h_max;	
		}
		public double calculaDistanciaMaxima(double vO,double alpha) {
			double g=9.8;
			double x_max=2*vO*Math.sin(alpha)/g;
			return x_max;	
		}
		@Override
		public String toString() {
			return "Bala [vO=" + vO + ", g=" + g + ", alpha=" + alpha + ", h_max=" + h_max + ", x_max=" + x_max + "]";
		}
		
	}


