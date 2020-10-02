package pkg;

public class CanceledOrder implements OrderActions {

	OrderStateBase osb;
	
	
	
	public CanceledOrder(OrderStateBase losb) {
		
		this.osb = losb;
	}

	

	@Override
	public void CancelOrder() {
		System.out.println("Order Already canceled");
		
	}

	@Override
	public void CompleteOrder() {
		System.out.println("Order canceled / doesn't exist, please created and other order");
		osb.setOrderState(osb.getIsStarted());
		
	}

	@Override
	public void RecallOrder(int OrderNumber) {
		System.out.println("Or doesn't exist, please created and other order");
		osb.setOrderState(osb.getIsStarted());		
		
	}

	@Override
	public void BuildOutOrder() {
				System.out.println("Attempint to start order");
		osb.setOrderState(osb.getIsStarted());		
		
	}

}
