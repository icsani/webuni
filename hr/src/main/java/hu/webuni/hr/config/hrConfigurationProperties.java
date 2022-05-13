package hu.webuni.hr.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "salary")
@Component
public class hrConfigurationProperties {
	
	private Raise raise = new Raise();
	
	public Raise getRaise() {
		return raise;
	}
	public void setRaise(Raise raise) {
		this.raise = raise;
	}
	
	public static class Raise {
		private Default def = new Default();
		private List<Smart> smart = new ArrayList<>();
		
		public Default getDef() {
			return def;
		}
		public void setDef(Default def) {
			this.def = def;
		}
		public List<Smart> getSmart() {
			return smart;
		}
		public void setSmart(List<Smart> smart) {
			this.smart = smart;
		}
	}

	public static class Default {
//		private int tenure;
		private int percent;
		
//		public int getTenure() {
//			return tenure;
//		}
//		public void setTenure(int tenure) {
//			this.tenure = tenure;
//		}
		public int getPercent() {
			return percent;
		}
		public void setPercent(int percent) {
			this.percent = percent;
		}
	}
	
	public static class Smart{
		private int tenure;
		private int percent;
		
		public int getTenure() {
			return tenure;
		}
		public void setTenure(int tenure) {
			this.tenure = tenure;
		}
		public int getPercent() {
			return percent;
		}
		public void setPercent(int percent) {
			this.percent = percent;
		}
	}
}
