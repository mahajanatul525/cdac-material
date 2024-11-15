﻿//------------------------------------------------------------------------------
// <auto-generated>
//    This code was generated from a template.
//
//    Manual changes to this file may cause unexpected behavior in your application.
//    Manual changes to this file will be overwritten if the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

using System;
using System.ComponentModel;
using System.Data.EntityClient;
using System.Data.Objects;
using System.Data.Objects.DataClasses;
using System.Linq;
using System.Runtime.Serialization;
using System.Xml.Serialization;

[assembly: EdmSchemaAttribute()]
namespace _04Ajax_exp.Models
{
    #region Contexts
    
    /// <summary>
    /// No Metadata Documentation available.
    /// </summary>
    public partial class StuContext : ObjectContext
    {
        #region Constructors
    
        /// <summary>
        /// Initializes a new StuContext object using the connection string found in the 'StuContext' section of the application configuration file.
        /// </summary>
        public StuContext() : base("name=StuContext", "StuContext")
        {
            this.ContextOptions.LazyLoadingEnabled = true;
            OnContextCreated();
        }
    
        /// <summary>
        /// Initialize a new StuContext object.
        /// </summary>
        public StuContext(string connectionString) : base(connectionString, "StuContext")
        {
            this.ContextOptions.LazyLoadingEnabled = true;
            OnContextCreated();
        }
    
        /// <summary>
        /// Initialize a new StuContext object.
        /// </summary>
        public StuContext(EntityConnection connection) : base(connection, "StuContext")
        {
            this.ContextOptions.LazyLoadingEnabled = true;
            OnContextCreated();
        }
    
        #endregion
    
        #region Partial Methods
    
        partial void OnContextCreated();
    
        #endregion
    
        #region ObjectSet Properties
    
        /// <summary>
        /// No Metadata Documentation available.
        /// </summary>
        public ObjectSet<tblStudent> tblStudents
        {
            get
            {
                if ((_tblStudents == null))
                {
                    _tblStudents = base.CreateObjectSet<tblStudent>("tblStudents");
                }
                return _tblStudents;
            }
        }
        private ObjectSet<tblStudent> _tblStudents;

        #endregion

        #region AddTo Methods
    
        /// <summary>
        /// Deprecated Method for adding a new object to the tblStudents EntitySet. Consider using the .Add method of the associated ObjectSet&lt;T&gt; property instead.
        /// </summary>
        public void AddTotblStudents(tblStudent tblStudent)
        {
            base.AddObject("tblStudents", tblStudent);
        }

        #endregion

    }

    #endregion

    #region Entities
    
    /// <summary>
    /// No Metadata Documentation available.
    /// </summary>
    [EdmEntityTypeAttribute(NamespaceName="StudentModel", Name="tblStudent")]
    [Serializable()]
    [DataContractAttribute(IsReference=true)]
    public partial class tblStudent : EntityObject
    {
        #region Factory Method
    
        /// <summary>
        /// Create a new tblStudent object.
        /// </summary>
        /// <param name="id">Initial value of the Id property.</param>
        public static tblStudent CreatetblStudent(global::System.Int32 id)
        {
            tblStudent tblStudent = new tblStudent();
            tblStudent.Id = id;
            return tblStudent;
        }

        #endregion

        #region Simple Properties
    
        /// <summary>
        /// No Metadata Documentation available.
        /// </summary>
        [EdmScalarPropertyAttribute(EntityKeyProperty=true, IsNullable=false)]
        [DataMemberAttribute()]
        public global::System.Int32 Id
        {
            get
            {
                return _Id;
            }
            set
            {
                if (_Id != value)
                {
                    OnIdChanging(value);
                    ReportPropertyChanging("Id");
                    _Id = StructuralObject.SetValidValue(value, "Id");
                    ReportPropertyChanged("Id");
                    OnIdChanged();
                }
            }
        }
        private global::System.Int32 _Id;
        partial void OnIdChanging(global::System.Int32 value);
        partial void OnIdChanged();
    
        /// <summary>
        /// No Metadata Documentation available.
        /// </summary>
        [EdmScalarPropertyAttribute(EntityKeyProperty=false, IsNullable=true)]
        [DataMemberAttribute()]
        public global::System.String Name
        {
            get
            {
                return _Name;
            }
            set
            {
                OnNameChanging(value);
                ReportPropertyChanging("Name");
                _Name = StructuralObject.SetValidValue(value, true, "Name");
                ReportPropertyChanged("Name");
                OnNameChanged();
            }
        }
        private global::System.String _Name;
        partial void OnNameChanging(global::System.String value);
        partial void OnNameChanged();
    
        /// <summary>
        /// No Metadata Documentation available.
        /// </summary>
        [EdmScalarPropertyAttribute(EntityKeyProperty=false, IsNullable=true)]
        [DataMemberAttribute()]
        public Nullable<global::System.Int32> TotalMarks
        {
            get
            {
                return _TotalMarks;
            }
            set
            {
                OnTotalMarksChanging(value);
                ReportPropertyChanging("TotalMarks");
                _TotalMarks = StructuralObject.SetValidValue(value, "TotalMarks");
                ReportPropertyChanged("TotalMarks");
                OnTotalMarksChanged();
            }
        }
        private Nullable<global::System.Int32> _TotalMarks;
        partial void OnTotalMarksChanging(Nullable<global::System.Int32> value);
        partial void OnTotalMarksChanged();

        #endregion

    }

    #endregion

}
