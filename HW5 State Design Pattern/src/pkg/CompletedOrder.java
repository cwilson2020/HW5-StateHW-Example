package pkg;

public class CompletedOrder implements OrderActions {

	OrderStateBase osb;
	
	
	
	public CompletedOrder(OrderStateBase losb) {
		
		this.osb = losb;
	}

	

	@Override
	public void CancelOrder() {
		System.out.println("Ok canceling order");
		osb.setOrderState(osb.getIsCanceled());
		
	}

	@Override
	public void CompleteOrder() {
		System.out.println("Order already completed");
		
		
	}

	@Override
	public void RecallOrder(int OrderNumber) {
		System.out.println("Already referencing the current order");
			
		
	}

	@Override
	public void BuildOutOrder() {
				System.out.println("You will have to start a new Order");
		osb.setOrderState(osb.getIsStarted());		
		
	}

}
