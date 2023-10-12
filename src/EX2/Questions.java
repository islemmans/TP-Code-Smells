package EX2;

import java.util.LinkedList;

public class Questions {
	
	    private LinkedList<String> _popQuestions = new LinkedList<String>();
	    private LinkedList<String> _scienceQuestions = new LinkedList<String>();
	    private LinkedList<String> _sportsQuestions = new LinkedList<String>();
	    private LinkedList<String> _rockQuestions = new LinkedList<String>();
	    
	    
	    
	    public void addPopQuestion(int i) {
	        _popQuestions.addLast("Pop Question " + i);
	    }

	    public void addScienceQuestion(int i) {
	        _scienceQuestions.addLast("Science Question " + i);
	    }

	    public void addSportsQuestion(int i) {
	        _sportsQuestions.addLast("Sports Question " + i);
	    }

	    public void addRockQuestion(int i) {
	    	_rockQuestions.addLast("Rock Question " + i);
	    }
	    
	    

		public LinkedList<String> get_popQuestions() {
			return _popQuestions;
		}

		public void set_popQuestions(LinkedList<String> _popQuestions) {
			this._popQuestions = _popQuestions;
		}

		public LinkedList<String> get_scienceQuestions() {
			return _scienceQuestions;
		}

		public void set_scienceQuestions(LinkedList<String> _scienceQuestions) {
			this._scienceQuestions = _scienceQuestions;
		}

		public LinkedList<String> get_sportsQuestions() {
			return _sportsQuestions;
		}

		public void set_sportsQuestions(LinkedList<String> _sportsQuestions) {
			this._sportsQuestions = _sportsQuestions;
		}

		public LinkedList<String> get_rockQuestions() {
			return _rockQuestions;
		}

		public void set_rockQuestions(LinkedList<String> _rockQuestions) {
			this._rockQuestions = _rockQuestions;
		}
	    
		public void askPopQuestion() {
	    	System.out.println(_popQuestions.getFirst());
	        _popQuestions.removeFirst();
	    }

	    public void askScienceQuestion() {
	    	System.out.println(_scienceQuestions.getFirst());
	        _scienceQuestions.removeFirst();
	    }

	    public void askSportsQuestion() {
	    	System.out.println(_sportsQuestions.getFirst());
	        _sportsQuestions.removeFirst();
	    }

	    public void askRockQuestion() {
	    	System.out.println(_rockQuestions.getFirst());
	        _rockQuestions.removeFirst();
	    }
	    
	    

}
