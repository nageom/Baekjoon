package queue;

public class Deque {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
	ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
	StringBuilder sb = new StringBuilder();

	int N = Integer.parseInt(br.readLine());

	for (int i = 0; i < N; i++) {

		String[] s = br.readLine().split(" ");

		// 첫 번째 단어에 대한 switch-case 
		switch (s[0]) {

			case "push_front": {
				dq.addFirst(Integer.parseInt(s[1]));
				break;
			}
			
			case "push_back": {
				dq.addLast(Integer.parseInt(s[1]));
				break;
			}

			case "pop_front": {
				if (dq.isEmpty()) {
					sb.append(-1).append('\n');
				} 
				else {
					sb.append(dq.pollFirst()).append('\n');
				}
				break;
			}

			case "pop_back": {
				if (dq.isEmpty()) {
					sb.append(-1).append('\n');
				} 
				else {
					sb.append(dq.pollLast()).append('\n');
				}
				break;
			}

			case "size": {
				sb.append(dq.size()).append('\n');
				break;
			}

			case "empty": {
				if (dq.isEmpty()) {
					sb.append(1).append('\n');
				} 
				else {
					sb.append(0).append('\n');
				}
				break;
			}

			case "front": {
				if (dq.isEmpty()) {
					sb.append(-1).append('\n');
				} 
				else {
					sb.append(dq.peekFirst()).append('\n');
				}
				break;
			}

			case "back": {
				if (dq.isEmpty()) {
					sb.append(-1).append('\n');
				} 
				else {
					sb.append(dq.peekLast()).append('\n');
				}
				break;
			}
		}
	}
	System.out.println(sb);
}
	
}
