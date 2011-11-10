package fumba.cards;

/**
 * The <code>Move</code> is a representation of a player move that is made in the game.
 * 
 * <p><i>Copyright (c) 1998, 2011 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0 
 * which accompanies this distribution.</i></p>
 * 
 * @author Fumbani Chibaka
 * @version 1.0, 10/28/2011
 * @see <a href="http:chibaka.com">Fumba Game Lab</a>
 */
public class Move {

	/** Tag to show if player is allowed to make another move **/
	private Boolean continuity;

	/** tag to show the attempted move is a valid one **/
	private Boolean validity;
	
	/** Constructs a move object **/
	public Move()
	{
		this.continuity = false;
		this.validity = false;
	}

	/**
	 * Sets the validity of the move
	 */
	public void setValidity(Boolean validity)
	{
		this.validity = validity;
	}

	/**
	 * Sets the continuity of the move
	 */
	public void setDone(Boolean continuity)
	{
		this.continuity = continuity;
	}

	/**
	 * Gets the validity of the move
	 * @return Boolean
	 */
	public Boolean getValidity() {
		return this.validity;
	}

	/**
	 * Gets the continuity of the move
	 * @return Boolean
	 */
	public Boolean  isDone() {
		return this.continuity;
	}

}