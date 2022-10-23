public class VirtualCounter extends ACounter {
    // インスタンス化のロジックを子クラスに委譲する
    // 「生成」という部分を具体的にしないで、派生可能な関数やクラスによって初めて具体的にする事により、生成物に柔軟性を与える
    public ISupporter inquire() {
        return new Operator();
    }
}
