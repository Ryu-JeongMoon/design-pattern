package composite;

public abstract class Entry {

    abstract String getName();

    abstract int getSize();

//    public Entry add(Entry entry) {
//        throw new FileTreatmentException();
//    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}


/*
add 의 위치에 대하여
1. Entry 에 두고 default 에러 처리 (필요한 경우 override)
2. Entry 에 두고 아무것도 구현하지 않음 (클라이언트 입장에서 기대한 행동일까?)
3. Entry 에 선언 후 구현은 하위 클래스에서 (위와 동일함)
4. Directory 에서만 구현 (Entry 로 참조하고 있을 때 일일이 type casting 해줘야 하는 번거로움이 있다)

장단점이 위와 같을 때, 어떻게 하는 것이 좋은가?
편의성을 생각해보자면 당연 Entry 에 두는게 나은데 원칙을 조금 따져보자면 Directory 에서만 구현해야 한다
File 은 add 를 알 필요도 없고 알아서도 안 된다
얘는 아키텍처 상 제약 사항이 내부에 다른 Composite 을 가질 수 없게 되어있다
 */