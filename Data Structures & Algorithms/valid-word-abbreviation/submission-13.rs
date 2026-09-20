impl Solution {
    pub fn valid_word_abbreviation(word: String, abbr: String) -> bool {
        let word_bytes = word.as_bytes();
        let abbr_bytes = abbr.as_bytes();
        
        let (mut i, mut j) = (0, 0);
        
        while i < word_bytes.len() && j < abbr_bytes.len() {
            if abbr_bytes[j].is_ascii_digit() {
         
                if abbr_bytes[j] == b'0' {
                    return false;
                }
                
               
                let mut num = 0;
                while j < abbr_bytes.len() && abbr_bytes[j].is_ascii_digit() {
                    num = num * 10 + (abbr_bytes[j] - b'0') as usize;
                    j += 1;
                }
                
               
                i += num;
            } else {
                if word_bytes[i] != abbr_bytes[j] {
                    return false;
                }
                i += 1;
                j += 1;
            }
        }
        
        i == word_bytes.len() && j == abbr_bytes.len()
    }
}