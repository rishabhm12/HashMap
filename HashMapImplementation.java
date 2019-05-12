class MapNode < K, V > 
{
  
K key;
  
V value;
  
MapNode < K, V > next;
  

MapNode (K key, V value) 
  {
    
this.key = key;
    
this.value = value;
  
}
 
}
 

//Implementation of HashMap<K,V> class
  class Hash < K, V > 
{
  
 
int size;			//tells use the number of elements in HashMap
int bucketSize;		// number of buckets
  
//map is the bucket ArrayList
    ArrayList < MapNode < K, V >> map;
  
 
Hash () 
  {
    
bucketSize = 20;
    
map = new ArrayList <> ();
    
 
for (int i = 0; i < bucketSize; i++)
      
      {
	
map.add (null);
  
} 
 
 
} 
 
 
private int bucketIndex (K key) 
  {
    
int hashcode = key.hashCode ();
    
 
return hashcode % bucketSize;
  
 
}
  
 
 
//Implementation of the put function
  void put (K key, V value) 
  {
    
int index = bucketIndex (key);
    
 
MapNode < K, V > head = map.get (index);
    
 
while (head != null)
      
      {
	
 
if (head.key.equals (key))
	  
	  {
	    
 
head.value = value;
	    
return;
	  
 
}
	
 
head = head.next;
      
}
    
 
head = map.get (index);
    
 
MapNode < K, V > node = new MapNode <> (key, value);
    
node.next = head;
    
 
map.set (index, node);
    
size++;
    
 
double loadFactor = (1.0 * size) / bucketSize;
    
 
if (loadFactor > 0.7)
      
      {
	
reHash ();
      
}
  
 
}
  
 
//Implementation of the get function
    V get (K key) 
  {
    
 
int index = bucketIndex (key);
    
MapNode < K, V > head = map.get (index);
    
 
while (head != null)
      
      {
	
 
if (head.key.equals (key))
	  
	  {
	    
 
head.value = value;
	    
return value;
	  
 
}
	
head = head.next;
      
}
    
 
return null;
  
 
}
  
 
V removeKey (K key) 
  {
    
int index = bucketIndex (key);
    
MapNode < K, V > head = map.get (index);
    
MapNode < K, V > prev = null;
    
 
while (head != null)
      
      {
	
 
if (head.key.equals (key))
	  
	  {
	    
if (prev == null)
	      
map.set (index, head.next);
	    
	    else
	      
prev.next = head.next;
	    
 
 
head.next = null;
	    
size--;
	    
return nodeValue;
	  
}
	
 
prev = head;
	
head = head.next;
      
}
    
 
return null;
  
 
}
  
 
 
//Size function
  int size () 
  {
    
return size;
  
}
  
 
//rehashing if loadFactor exceeds 0.
  void reHash () 
  {
    
 
System.out.println (" Rehashing: size of Hash<> " + size +
			   " num of buckets are " + bucketSize);
    
ArrayList < MapNode < K, V >> temp = map;
    
map = new ArrayList <> ();
    
size = 0;
    
bucketSize *= 2;
    
 
for (int i = 0; i < bucketSize; i++)
      
map.add (null);
    
 
for (int i = 0; i < temp.size (); i++)
      
      {
	
MapNode < K, V > head = temp.get (i);
	
 
while (head != null)
	  
	  {
	    
K key = head.key;
	    
V value = head.value;
	    
insert (key, value);
	    
head = head.next;
	  
 
}
      
 
 
}
  
 
 
}
  
 
//
  
double loadFactor () 
  {
    
return (1.0 * size) / bucketSize;
  
}

 
}


 
 
public class HashMapImplementation 
{
  
public static void main (String[]args) 
  {
    
 
Hash < String, Integer > map = new Hash <> ();
    
 
for (int i = 0; i < 30; i++)
      
      {
	
map.put ("qwerty" + i, i);
	
System.out.println ("i= " + i + " lf = " + loadFactor ());

} 
 
 
} 
}
