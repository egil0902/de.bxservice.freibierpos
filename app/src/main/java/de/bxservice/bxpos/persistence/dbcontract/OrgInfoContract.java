/**********************************************************************
 * This file is part of FreiBier POS                                   *
 *                                                                     *
 *                                                                     *
 * Copyright (C) Contributors                                          *
 *                                                                     *
 * This program is free software; you can redistribute it and/or       *
 * modify it under the terms of the GNU General Public License         *
 * as published by the Free Software Foundation; either version 2      *
 * of the License, or (at your option) any later version.              *
 *                                                                     *
 * This program is distributed in the hope that it will be useful,     *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of      *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the        *
 * GNU General Public License for more details.                        *
 *                                                                     *
 * You should have received a copy of the GNU General Public License   *
 * along with this program; if not, write to the Free Software         *
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,          *
 * MA 02110-1301, USA.                                                 *
 *                                                                     *
 * Contributors:                                                       *
 * - Diego Ruiz - Bx Service GmbH                                      *
 **********************************************************************/
package de.bxservice.bxpos.persistence.dbcontract;

import android.provider.BaseColumns;

/**
 * Created by Diego Ruiz on 27/04/16.
 */
public class OrgInfoContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    public OrgInfoContract() {
    }

    /* Inner class that defines the table contents */
    public static abstract class OrgInfoDB implements BaseColumns {
        public static final String TABLE_NAME = "org_info";
        public static final String COLUMN_NAME_ORG_INFO_ID = "org_info_id";
        public static final String COLUMN_NAME_NAME     = "Name";
        public static final String COLUMN_NAME_ADDRESS1 = "Address1";
        public static final String COLUMN_NAME_ADDRESS2 = "Address2";
        public static final String COLUMN_NAME_CITY     = "city";
        public static final String COLUMN_NAME_POSTAL   = "postal";
        public static final String COLUMN_NAME_PHONE    = "phone";
    }
}
