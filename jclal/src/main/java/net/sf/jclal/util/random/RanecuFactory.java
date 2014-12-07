/*
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package net.sf.jclal.util.random;

/**
 * Ranecu factory.
 *
 * @author Sebastian Ventura
 */
public final class RanecuFactory extends AbstractRandGenFactory {
    /////////////////////////////////////////////////////////////////
    // --------------------------------------- Serialization constant
    /////////////////////////////////////////////////////////////////

    /**
     * Generated by Eclipse
     */
    private static final long serialVersionUID = -5925252460325410373L;

    /////////////////////////////////////////////////////////////////
    // ------------------------------------------------- Constructors
    /////////////////////////////////////////////////////////////////
    /**
     * Empty (default) constructor.
     */
    public RanecuFactory() {
        super();
    }

    /////////////////////////////////////////////////////////////////
    // ----------------------------------------------- Public methods 
    /////////////////////////////////////////////////////////////////
    // IRandGenFactory interface 
    /**
     * {@inheritDoc}
     *
     * @return The random generator.
     */
    @Override
    public final IRandGen createRandGen() {
        return new Ranecu(seedGenerator.nextSeed(), seedGenerator.nextSeed());
    }
}
