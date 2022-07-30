package x.mvmn.permock.model.rules;

import lombok.Data;

@Data
public class Tuple2<A, B> {
	private final A a;
	private final B b;
}
