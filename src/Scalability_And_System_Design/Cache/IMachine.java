/*
 * Copyright (C) 2018 Oluwole Oyetoke <oluwoleoyetoke@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Scalability_And_System_Design.Cache;

/**
 *
 * @author Oluwole Oyetoke <oluwoleoyetoke@gmail.com>
 */
public interface IMachine {
    void cearCache();
    void checkYourCache(int queryHash, IMachine.IResponse callback, RequestType requestType, RequestSource from);
    String search(int queryHash, String query, int count);
    String processSearch(String query);
    int checkDataState(int data);
    
    //callback
    interface IResponse{
        void response(String result, int present, int machineId);
    }
}
