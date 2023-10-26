package showroom_ManagementSystem;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Vehicle {
			
		private String chasisNo;
		private Colors vColor;
		private double basePrice;
		private String company;
		private boolean isAvailable;
		private Date manufactureDate;
		
		public static SimpleDateFormat sdf;
		
		static {
			sdf=new SimpleDateFormat("yyyy-MM-dd");
		}
		
		public Vehicle(String chasisNo, Colors vcolor, double basePrice, String company, boolean isAvailable, Date manufactureDate) 
		{
			super();
			this.chasisNo = chasisNo;
			this.vColor=vColor	;		
			this.basePrice=basePrice;
			this.company=company;
			this.isAvailable=true;
			this.manufactureDate=manufactureDate;
					
		}
		
		@Override
		public String toString()
		{
			return "Vehicle [chasisNo=" + chasisNo + ", vColor=" + vColor + ", basePrice=" + basePrice + ", company="
					+ company + ", isAvailable=" + isAvailable + ", manufactureDate=" + manufactureDate + "]";
		}
		
		@Override
		public boolean equals(Object o)
		{
			System.out.println("vehicles equal ");
			if(o instanceof Vehicle) 
			{
				Vehicle v=(Vehicle)o;
				return this.chasisNo.equals(v.chasisNo);
			}
			else 
				return false;
		}
		
}