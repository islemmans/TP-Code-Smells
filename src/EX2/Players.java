package EX2;

import java.util.ArrayList;

public class Players {
	private ArrayList<String> _players = new ArrayList<String>();

    private int[] _places = new int[6];
    private int[] _purses = new int[6];

    private boolean[] _inPenaltyBox = new boolean[6];
    
    private int _currentPlayer;
    private boolean _isGettingOutOfPenaltyBox;
    
    public boolean IsPlayable()
    {
        return (_players.size() >= 2);
    }
    
    public void addPlayer(String playerName)
    {
        _players.add(playerName);
        _places[_players.size()] = 0;
        _purses[_players.size()] = 0;
        _inPenaltyBox[_players.size()] = false;

        System.out.println(playerName + " was added");
        System.out.println("They are player number " + _players.size());
        //return true;
    }
    
    public String currentCategory() {
        int currentPlace = _places[_currentPlayer];
        switch (currentPlace) {
            case 0:
            case 4:
            case 8:
                return "Pop";
            case 1:
            case 5:
            case 9:
                return "Science";
            case 2:
            case 6:
            case 10:
                return "Sports";
            default:
                return "Rock";
        }
    }
    

	public void movePlayer(int roll) {
		_places[_currentPlayer] = _places[_currentPlayer] + roll;
		if (_places[_currentPlayer] > 11) _places[_currentPlayer] = _places[_currentPlayer] - 12;

		System.out.println(_players.get(_currentPlayer) + "'s new location is " + _places[_currentPlayer]);
	}
	
	public void isgettingOutOfPenaltyBox(int roll) {
		
            _isGettingOutOfPenaltyBox = true;
            System.out.println(_players.get(_currentPlayer) + " is getting out of the penalty box");
            movePlayer(roll);
            System.out.println("The category is " + currentCategory());
           
	}
	
	public void isnotgettingOutOfPenaltyBox(int roll) {
		System.out.println(_players.get(_currentPlayer) + " is not getting out of the penalty box");
        _isGettingOutOfPenaltyBox = false;
	}
	
	public boolean WasCorrectlyAnswered()
    {
        if (_inPenaltyBox[_currentPlayer])
        {
            if (_isGettingOutOfPenaltyBox)
            {
                System.out.println("Answer was correct!!!!");
                _purses[_currentPlayer]++;
                System.out.println(_players.get(_currentPlayer)+ " now has "+ _purses[_currentPlayer]+ " Gold Coins.");
   
                var winner = !(_purses[_currentPlayer] == 6);
                _currentPlayer++;
                if (_currentPlayer == _players.size()) _currentPlayer = 0;

                return winner;
            }
            else
            {
                _currentPlayer++;
                if (_currentPlayer == _players.size()) _currentPlayer = 0;
                return true;
            }
        }
        else
        {
            System.out.println("Answer was corrent!!!!");
            _purses[_currentPlayer]++;
            System.out.println(_players.get(_currentPlayer)+ " now has "+ _purses[_currentPlayer] + " Gold Coins.");
           
            var winner = !(_purses[_currentPlayer] == 6);
            _currentPlayer++;
            if (_currentPlayer == _players.size()) _currentPlayer = 0;

            return winner;
        }
    }

    public boolean WrongAnswer()
    {
        System.out.println("Question was incorrectly answered");
        System.out.println(_players.get(_currentPlayer) + " was sent to the penalty box");
        _inPenaltyBox[_currentPlayer] = true;

        _currentPlayer++;
        if (_currentPlayer == _players.size()) _currentPlayer = 0;
        return true;
    }

	public ArrayList<String> get_players() {
		return _players;
	}

	public void set_players(ArrayList<String> _players) {
		this._players = _players;
	}

	public int[] get_places() {
		return _places;
	}

	public void set_places(int[] _places) {
		this._places = _places;
	}

	public int[] get_purses() {
		return _purses;
	}

	public void set_purses(int[] _purses) {
		this._purses = _purses;
	}

	public boolean[] get_inPenaltyBox() {
		return _inPenaltyBox;
	}

	public void set_inPenaltyBox(boolean[] _inPenaltyBox) {
		this._inPenaltyBox = _inPenaltyBox;
	}

	public int get_currentPlayer() {
		return _currentPlayer;
	}

	public void set_currentPlayer(int _currentPlayer) {
		this._currentPlayer = _currentPlayer;
	}

	public boolean is_isGettingOutOfPenaltyBox() {
		return _isGettingOutOfPenaltyBox;
	}

	public void set_isGettingOutOfPenaltyBox(boolean _isGettingOutOfPenaltyBox) {
		this._isGettingOutOfPenaltyBox = _isGettingOutOfPenaltyBox;
	}
    
    
    
    
}
