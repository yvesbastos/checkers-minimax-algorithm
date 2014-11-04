package br.ufal.ic.ia;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author yvesbastos
 * @version 0.1
 */
public class Item
{
	protected static final Color CLARO = new Color(251, 249, 246);
	protected static final Color ESCURO = Color.BLACK;

	private Color color;
	
	private Jogador dono;

	/**
	 * 
	 * @return
	 */
	public Jogador getDono() {
		return dono;
	}
	
	/**
	 *
	 * @return
	 */
	public static Item criarItemClaro(Jogador dono)
	{
		return new Item(CLARO, dono);
	}

	/**
	 * 
	 * @return
	 */
	public static Item criarItemEscuro(Jogador dono)
	{
		return new Item(ESCURO, dono);
	}

	/**
	 * Creates a new Piece instance.
	 * @param color the piece's color
	 */
	protected Item(Color color, Jogador dono)
	{
		this.color = color;
		this.dono = dono;
	}

	/**
	 * Draws the piece.
	 * @param g the associated Graphics instance
	 */
    public void desenhar(Graphics g)
    {
        int x = 30, y = 30, radius = 20;
		
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }

    /**
     * Returns the piece's color.
     * @return the color
     */
	public Color getCor()
	{
		return color;
	}

	/**
	 *
	 * @return
	 */
	public boolean isDark()
	{
		return color.equals(ESCURO);
	}

	/**
	 *
	 * @return
	 */
	public boolean isLight()
	{
		return color.equals(CLARO);
	}

	@Override
	public String toString()
	{
		if(isDark())
			return "DARK";
		else if(isLight())
			return "LIGHT";
		else
			return "UNKNOWN";
	}
}
