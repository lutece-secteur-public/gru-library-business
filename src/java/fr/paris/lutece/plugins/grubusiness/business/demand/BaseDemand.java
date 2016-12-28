/*
 * Copyright (c) 2002-2016, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.grubusiness.business.demand;


/**
 * Base Demand
 */
public class BaseDemand
{
    // Variables declarations 
    private String _strId;
    private String _strReference;
    private String _strTypeId;
    protected int _nStatusId;
    protected long _lTimeOpened;

    /**
     * Gives the id
     *
     * @return The id
     */
    public String getId(  )
    {
        return _strId;
    }

    /**
     * Sets the id
     *
     * @param strId The id
     */
    public void setId( String strId )
    {
        _strId = strId;
    }

    /**
     * Gives the reference
     *
     * @return The reference
     */
    public String getReference(  )
    {
        return _strReference;
    }

    /**
     * Sets the reference
     *
     * @param strReference The reference
     */
    public void setReference( String strReference )
    {
        _strReference = strReference;
    }

    /**
     * Gives the status id
     *
     * @return The status id
     */
    public int getStatusId(  )
    {
        return _nStatusId;
    }

    /**
     * Sets the status id
     *
     * @param nStatusId The status id
     */
    public void setStatusId( int nStatusId )
    {
        _nStatusId = nStatusId;
    }

    /**
     * Sets the type id
     *
     * @param strTypeId The type id
     */
    public void setTypeId( String strTypeId )
    {
        _strTypeId = strTypeId;
    }

    /**
     * Gves the type id
     *
     * @return The type id
     */
    public String getTypeId(  )
    {
        return _strTypeId;
    }

    /**
     * Set Time opened in milliseconds
     * @param lTimeOpened Time opened in milliseconds
     */
    public void setTimeOpenedInMs( long lTimeOpened )
    {
        _lTimeOpened = lTimeOpened;
    }

    /**
     * Get Time opened in milliseconds
     * @return Time opened in milliseconds
     */
    public long getTimeOpenedInMs(  )
    {
        return _lTimeOpened;
    }
}
