public Map<String, Integer> wordCount(String[] strings) {
   Map <String, Integer> result = new HashMap<>();
  
  for(String entry : strings){
     result.merge(entry, 1, (currentCount, notUsed) -> ++currentCount);
  }
 return result;
}
