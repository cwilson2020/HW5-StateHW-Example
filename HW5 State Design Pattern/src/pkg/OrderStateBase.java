package pkg;

public class OrderStateBase {


	
	boolean orderExists = false;
	OrderState canceled;
	OrderState completed;
	OrderState recalled;
	OrderState started;

	OrderState orderState;
	
		public OrderStateBase() {
	 canceled = new CanceledOrder(this);
	 completed  = new CompletedOrder (this);
fulfilled = new FulfilledOrder
	 started  = new  StartedOrder(this);			
	}
	
		void setOrderState (OrderState state) {
			orderState =state;
		}
		
		public void lCanceled() {
			orderState.CancelOrder();
		}
		
		public void lCompleted() {
			orderState.CompleteOrder();
		}
		
		public void lRecalled(int OrderNumber) {
			orderState.RecallOrder( OrderNumber);
		}
		
		public void lStarted() {
			orderState.BuildOutOrder();
		}
		
		public OrderState getIsCanceled()
		{
			return canceled;
			}
		
		public OrderState getIsComplete()
		{
			return completed;
			}
		public OrderState getIsRecalled()
		{
			return recalled;
			}
		public OrderState getIsStarted()
		{
			return canceled;
			}
}
