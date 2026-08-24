class Solution {
    public String applySubstitutions(List<List<String>> replacements, String text) {
        Map<String, String> store = new HashMap<>();
        for (List<String> temp : replacements) {
            store.put(temp.get(0), temp.get(1));
        }

        boolean changed = true;
        while (changed) {
            changed = false;
            for (Map.Entry<String, String> entry : store.entrySet()) {
                String val = entry.getValue();
                for (String key : store.keySet()) {
                    String target = "%" + key + "%";
                    if (val.contains(target)) {
                        val = val.replace(target, store.get(key));
                        entry.setValue(val);
                        changed = true;
                    }
                }
            }
        }

        String result = text;
        for (String key : store.keySet()) {
            result = result.replace("%" + key + "%", store.get(key));
        }
        return result;
    }
}