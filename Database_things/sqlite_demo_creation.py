import sqlite3
from sqlite3 import Error

def create_connection(db_file):
    """ create a database connection to SQLite database """
    conn = None
    try:
        conn = sqlite3.connect(db_file)        
        print(sqlite3.version)
    except Error as e:
        print(e)
    finally:
        if conn:
            conn.close()


if __name__ == '__main__':
    create_connection(r"D:\\TestiRepository\\Database_things\\Mydatabase.db") #A connection to an SQLite database.
# Running this file for the first time will implement / make the database file Mydatabase.db.

