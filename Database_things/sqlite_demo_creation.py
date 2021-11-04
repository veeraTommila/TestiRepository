import sqlite3
import time
import datetime
import random
from sqlite3 import Error

#conn = sqlite3.connect('c:\sqlite\db\pythonsqlite.db') #Connection to the database.
#cursor = conn.cursor()
#cursor2 = conn.cursor()

def create_connection(db_file):
    """ create a database connection to SQLite database """
    conn = None
    
    #This is an exception handler like try catch in C#.
    try:
        #Try to do these.
        conn = sqlite3.connect(db_file)        
        print(sqlite3.version)
    except Error as e:
        #The code to handle goes here.
        print(e)
    finally:
        #Code to execute after the try block goes here.
        if conn:
            conn.close()


if __name__ == '__main__':
    create_connection(r"D:\\TestiRepository\\Database_things\\Mydatabase.db") #A connection to an SQLite database.
# Running this file for the first time will implement / make the database file Mydatabase.db.

